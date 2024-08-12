object CaesarCipher {

  def encryptCaesar(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decryptCaesar(ciphertext: String, shift: Int): String = {
    ciphertext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base - shift + 26) % 26 + base).toChar
      } else {
        char
      }
    }
  }
def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
  operation(text, shift)
}

def main(args: Array[String]): Unit = {
  val plaintext = "Hello, World!"
  val shift = 3

  val encryptedText = cipher(plaintext, shift, CaesarCipher.encryptCaesar)
  println(s"Encrypted: $encryptedText")

  val decryptedText = cipher(encryptedText, shift, CaesarCipher.decryptCaesar)
  println(s"Decrypted: $decryptedText")
}
  }