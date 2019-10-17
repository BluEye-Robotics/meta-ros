DESCRIPTION = "Driver for NovAtel receivers"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost diagnostic-msgs diagnostic-updater gps-common libpcap nav-msgs nodelet novatel-gps-msgs roscpp sensor-msgs std-msgs swri-math-util swri-nodelet swri-roscpp swri-serial-util swri-string-util tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/novatel_gps_driver-release/archive/release/melodic/novatel_gps_driver/3.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e1d61f57fbdbd4c6d95d1ff2152c0bea"
SRC_URI[sha256sum] = "d1fbdbe8605a17c0fc9ee5a3c7c53d45c7422dabc4b4e1ca6c57dd518c8cded1"

S = "${WORKDIR}/novatel_gps_driver-release-release-melodic-novatel_gps_driver-3.8.0-1"

inherit catkin
