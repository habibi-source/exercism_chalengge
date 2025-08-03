package cars

// CalculateWorkingCarsPerHour calculates how many working cars are
// produced by the assembly line every hour.
func CalculateWorkingCarsPerHour(productionRate int, successRate float64) float64 {
	result:=float64(productionRate) * (successRate / 100)
    return result
}

// CalculateWorkingCarsPerMinute calculates how many working cars are
// produced by the assembly line every minute.
func CalculateWorkingCarsPerMinute(productionRate int, successRate float64) int {
		workingPerHours := float64(productionRate) * (successRate/100)
    workingPerMinutes := workingPerHours / 60
    return int(workingPerMinutes)
}

// CalculateCost works out the cost of producing the given number of cars.
func CalculateCost(carsCount int) uint {
 puluhan := carsCount / 10 ;
    sisa := carsCount % 10 ;
    totalCost := puluhan * 95000 + sisa * 10000
    return uint(totalCost)
}
