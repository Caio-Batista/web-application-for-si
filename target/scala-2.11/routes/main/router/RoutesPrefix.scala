
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carlos/git/web-application-for-si/conf/routes
// @DATE:Tue Apr 19 23:08:34 BRT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
