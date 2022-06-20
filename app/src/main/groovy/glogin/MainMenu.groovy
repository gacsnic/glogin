package glogin

class MainMenu {

    void sayMenuMain(){
        println """
         1. Usuarios
         2. Acceso de usuarios
         3. Privilegio
         4. Salir
         
         Elija un numero del menu 
         """.center(150)
        def inMenu
        if(System.console()){
            inMenu=System.console().readLine('Elija un numero del menu')
        }else {
            //  def sc=new Scanner(System.in)
            //  sc.hasNextLine()
            //inMenu=sc.nextLine()

            switch (System.in.newReader().readLine().toInteger()) {
                case 1 :
                    println 'Selecion 1'
                    break
                case 2 :
                    println 'Selecion 2'
                    break
                case 3 :
                    println 'Selecion 3'
                    break
                default:
                    println 'Adios'
                    break
            }

        }
        print "\033\143"
    }

}
