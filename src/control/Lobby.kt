package control

import business.InviteBusiness
import entity.Invite
import entity.Person

class Lobby {

    private val inviteBusiness = InviteBusiness()

    init {
        println("Portaria inicializada")
        control()
    }

    private fun control()  {

        val age = Console.readAge("Qual sua idade?")
        val person = Person(age)
        if (inviteBusiness.underAge(person))
            return println("Negado. Menores de idade não são permitidos.")

        val type = Console.readType("Qual é o tipo de convite?")
        if (inviteBusiness.validateType(type))
            return println("Negado. Convite inválido.")

        val code = Console.readCode("Qual é o código do convite?")
        val invite = Invite(type, code)
        if (!inviteBusiness.validateCode(invite))
            return println("Negado. Convite inválido.")

        return println("Welcome :)")
    }
}