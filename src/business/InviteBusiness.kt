package business

import entity.Invite
import entity.Person

class InviteBusiness {

        fun underAge(person : Person ) = person.age <= 18

        fun validateType(type: String) : Boolean =
            (type != "comum" && type != "premium" && type != "luxo")

        fun validateCode(invite: Invite) = when(invite.type) {
            "comum" -> invite.code.startsWith("xt")
            "premium", "luxo" -> invite.code.startsWith("xl")
            else -> false
        }

}