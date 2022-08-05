package control

class Console private constructor(){

    companion object {

        fun readAge(msg: String): Int {
            var returnAge: Int? = null

            do {
                print(msg)
                val age = readLine()

                if (age != null && age != "") {
                    returnAge = age.toIntOrNull()

                    if (returnAge == null || returnAge <= 0) println("Idade inválida")

                } else println("Idade inválida")

            } while (returnAge == null || returnAge <= 0)

            return returnAge
        }

        fun readType(msg: String): String {
            var returnType: String? = null

            do {
                print(msg)
                val type = readLine()

                if (type != null && type != "") {
                    returnType = type.toLowerCase()

                } else println("Tipo inválido")

            } while (returnType == null || returnType == "")

            return returnType
        }

        fun readCode(msg: String): String {
            var returnCode: String? = null

            do {
                print(msg)
                val code = readLine()

                if (code != null && code != "") {
                    returnCode = code.toLowerCase()

                } else println("Convite inválido")

            } while (returnCode == null)

            return returnCode
        }
    }
}