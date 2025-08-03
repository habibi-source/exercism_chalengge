// Package weather to see weather.
package weather
// CurrentCondition safsa.
var CurrentCondition string
// CurrentLocation fsafs.
var CurrentLocation string

// Forecast asfasf.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
