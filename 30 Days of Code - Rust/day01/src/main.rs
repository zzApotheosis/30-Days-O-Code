/*
 * Created by Steven Jennings on 22 June 2021.
 */

/* Imports */
use std::io::{self, BufRead};

/* Main */
fn main() {
    /* Declare variables */
    let i: i32 = 4i32;
    let d: f64 = 4.0f64;
    let s: std::string::String = "HackerRank ".to_string();
    let i_in: i32;
    let d_in: f64;
    let s_in: std::string::String;
    let mut buffer: std::string::String = String::new();
    
    /* Fetch stdin */
    buffer.clear();
    io::stdin().lock().read_line(&mut buffer).unwrap();
    i_in = buffer.trim().parse::<i32>().unwrap();
    buffer.clear();
    io::stdin().lock().read_line(&mut buffer).unwrap();
    d_in = buffer.trim().parse::<f64>().unwrap();
    buffer.clear();
    io::stdin().lock().read_line(&mut buffer).unwrap();
    s_in = buffer.trim().clone().to_string();
    
    /* Write stdout */
    println!("{}", i + i_in);
    println!("{:.1}", d + d_in);
    print!("{}{}", s, s_in);
}
