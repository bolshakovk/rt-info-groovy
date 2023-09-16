static void main(String[] args) {
  def array = [1, 3, 4, 5, 1, 5, 4]
  def counts = array.groupBy { it }.collectEntries { [(it.key): it.value.size()] }
  println(counts)
}