#!/usr/bin/perl -w

# Main Class
package Main;

# Imports
use strict;
use warnings;
use FindBin;
use Cwd;
use File::Path qw(make_path);

# Class Fields
my $exec_name = "$FindBin::RealScript";
my $exec_path = "$FindBin::RealBin/$FindBin::RealScript";
my $exec_dir = "$FindBin::RealBin";
my $original_cwd = getcwd();

# Main Subroutine
sub main {
    # Define subroutine variable
    my $exit_code = 0;
    my $limit = 30;
    my $path;
    
    # Create Cargo projects
    for (my $i = 0; $i < $limit; $i++) {
        $path = "day" . sprintf("%02d", $i);
        make_path($path);
        chdir($path) or die($!);
        system("cargo init");
        chdir($original_cwd);
        die($!) if ($?);
    }
    
    # End main subroutine
    return $exit_code;
}

# End Main Class
1;

# Execute
exit(Main::main());
