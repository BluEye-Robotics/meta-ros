DESCRIPTION = "The lms1xx package contains a basic ROS driver for the SICK LMS1xx line of LIDARs."
AUTHOR = "Konrad Banachowicz"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "rosconsole-bridge roscpp roscpp-serialization sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/clearpath-gbp/lms1xx-release/archive/release/melodic/lms1xx/0.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a75b65d1ea9ef57a97a6849fbc0f2e8"
SRC_URI[sha256sum] = "9a9ff8a7991afb1c4a8d05f8b4518fd5a944da3dba605db67a4f55ea6c049f76"

S = "${WORKDIR}/LMS1xx-release-release-melodic-lms1xx-0.2.0-1"

inherit catkin
