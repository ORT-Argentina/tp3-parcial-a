package ar.org.cdsfuturo.examen.entity

class Notificaciones(texto: String?, tiempo: String?) {

    var texto: String = ""
    var tiempo: String = ""

    init {
        this.texto = texto!!
        this.tiempo = tiempo!!
    }
}