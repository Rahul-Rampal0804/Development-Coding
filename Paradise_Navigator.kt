import java.time.LocalDate  //I have used these libraries to deal with date factor
import java.time.Period     // To count days between check-in and check-out

class Guest(
    val guestName: String,
    val roomNumber: Int,
    val checkInDate: String,
    val service: String,
    val checkOutDate: String,
    val guestStatus: GuestStatus,
    val specialRequests: String
) {
    enum class GuestStatus {
        Active, CheckedOut
    }

    // Made this function to count days interval
    val numberOfDays: Int
        get() {
            val date1 = LocalDate.parse(checkInDate)
            val date2 = LocalDate.parse(checkOutDate)
            return Period.between(date1, date2).days  // function to count days interval
        }
}

//inheritance is being demonstrated as well
class Concierge {
    fun bookService(guest: Guest, service: String) {
        println("Booking $service for ${guest.guestName}")
    }

    fun checkRoomAvailability(guest: Guest, date: String, roomType: String): Boolean {
        //println("Checking room availability for $roomType on $date")
        println("Checking room availability for $roomType on $date")

        // Access Guest properties
        if (guest.checkInDate == date ) {
            // Your logic here
            return true
        }

        return false

    }

    fun generateBill(guest: Guest): Double {
        println("Generating bill for ${guest.guestName}")

        val roomCostPerDay = 200.0 // Assuming a cost per day
        val serviceCost = 50.0 // Assuming a service cost

        // Calculate the total bill based on the number of days and additional service cost
        val totalBill = guest.numberOfDays * roomCostPerDay + serviceCost

        println("Generated bill for ${guest.guestName}: $totalBill")
        return totalBill
    }
}
//Reservation System to let them know, who booked which room and when
class Reservation {
    fun makeRoomReservation(guest: Guest, roomType: String, checkInDate: String, checkOutDate: String) {
        println("Making room reservation for ${guest.guestName} - Room Type: $roomType, Check-in: $checkInDate, Check-out: $checkOutDate")
    }

    fun makeServiceReservation(guest: Guest, serviceType: String, date: String) {
        println("Making service reservation for ${guest.guestName} - Service Type: $serviceType, Date: $date")
    }
}

// This class is for billing system
class BillingSystem {
    fun generateDetailedBill(guest: Guest): Double {
        val roomCostPerDay = 200.0
        val serviceCost = 50.0
        val numberOfDays = guest.numberOfDays

        val totalCost = numberOfDays * roomCostPerDay + serviceCost
        println("Generated detailed bill for ${guest.guestName}: $totalCost")

        return totalCost
    }

    fun processPayment(guest: Guest, amount: Double) {
        val remainingBalance = generateDetailedBill(guest) - amount
        if (remainingBalance >= 0) {
            println("${guest.guestName} made a payment of $amount. Remaining balance: $remainingBalance")
        } else {
            println("Error: Payment exceeds the total cost. No payment processed.")
        }
    }

    fun getBalance(guest: Guest): Double {
        println("Getting balance for ${guest.guestName}")

        // Fixed balance for demonstration purposes
        return 50.0
    }
}

fun main() {
    val concierge = Concierge()
    val reservation = Reservation()
    val billingSystem = BillingSystem()

    //object for guest class with hard coded values
    val guest = Guest(
        "John Doe",
        101,
        "2022-02-12",
        "Spa Treatment",
        "2022-02-15",
        Guest.GuestStatus.Active,
        "Special requests: None"
    )

    //checking bookService and other functions now
    concierge.bookService(guest, guest.service)

    concierge.checkRoomAvailability(guest, "2022-02-12", "101")

    reservation.makeRoomReservation(guest, "Deluxe Room", "2022-02-12", "2022-02-15")

    reservation.makeServiceReservation(guest, "Excursion Booking", "2022-02-12")

    val detailedBill = billingSystem.generateDetailedBill(guest)
    println("Detailed Bill Amount: $$detailedBill")

    billingSystem.processPayment(guest, 100.0)

    concierge.checkRoomAvailability(guest, "2022-03-01", "101")

    val currentBalance = billingSystem.getBalance(guest)
    println("Current Balance: $$currentBalance") //every output is being printed on the console correctly
}
