
import javax.persistence.*

@Entity
@Table(name = "TB_PESSOA")
open abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PESSOA")
    open var id: Long? = null

    @Column(name = "TELEFONE_PESSOA")
    open var telefone: String? = null

    @Column(name = "IDADE_PESSOA")
    open var idade: Long? = null

    @Column(name = "CPF_PESSOA")
    open var cpf: String? = null

    @Column(name = "NOME_PESSOA")
    open var nome: String? = null
}