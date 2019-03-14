DESCRIPTION = "Driver for NovAtel receivers"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost diagnostic-msgs diagnostic-updater gps-common libpcap nav-msgs nodelet novatel-gps-msgs roscpp sensor-msgs std-msgs swri-math-util swri-nodelet swri-roscpp swri-serial-util swri-string-util tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/novatel_gps_driver-release/archive/release/melodic/novatel_gps_driver/3.6.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "51350824fedf27543018dc7e3a939553"
SRC_URI[sha256sum] = "eb832835dd1bedefc42431349c15b6cd8d5fd16f7ad73ee0e8f1ff511fab9bb1"

S = "${WORKDIR}/novatel_gps_driver-release-release-melodic-novatel_gps_driver-3.6.0-0"

inherit catkin
