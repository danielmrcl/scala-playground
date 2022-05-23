object SpaceAge {
  private val calculeAge = (ageSeconds: Double, yearSeconds: Double) => ageSeconds / (yearSeconds * 31557600)

  val onEarth   = (seconds: Double) => calculeAge(seconds, 1.0)
  val onMercury = (seconds: Double) => calculeAge(seconds, 0.2408467)
  val onVenus   = (seconds: Double) => calculeAge(seconds, 0.61519726)
  val onMars    = (seconds: Double) => calculeAge(seconds, 1.8808158)
  val onJupiter = (seconds: Double) => calculeAge(seconds, 11.862615)
  val onSaturn  = (seconds: Double) => calculeAge(seconds, 29.447498)
  val onUranus  = (seconds: Double) => calculeAge(seconds, 84.016846)
  val onNeptune = (seconds: Double) => calculeAge(seconds, 164.79132)
}