package bookster

class BookController {
def scaffold = true
  def index() {
        redirect(action:list)
    }
}
