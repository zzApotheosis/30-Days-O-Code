/*
 * Created by Steven Jennings on 24 June 2021.
 */

/* Imports */
use std::io::BufRead;

/* Main */
fn main() {
    /* Define variables */
    let mut buffer = std::string::String::new();
    let meal_cost: f64;
    let tip_percent: i32;
    let tax_percent: i32;
    let total: f64;
    
    /* Get stdin */
    buffer.clear();
    std::io::stdin().lock().read_line(&mut buffer).unwrap();
    meal_cost = buffer.trim().parse::<f64>().unwrap();
    
    buffer.clear();
    std::io::stdin().lock().read_line(&mut buffer).unwrap();
    tip_percent = buffer.trim().parse::<i32>().unwrap();
    
    buffer.clear();
    std::io::stdin().lock().read_line(&mut buffer).unwrap();
    tax_percent = buffer.trim().parse::<i32>().unwrap();

    /* Calculate total */
    total = meal_cost * (1.0_f64 + (tip_percent as f64 / 100.0_f64) + (tax_percent as f64 / 100.0_f64));

    /* Write stdout */
    print!("{}", total.round());
}
