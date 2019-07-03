DESCRIPTION = "This package wraps the libphidget21 to use it as a ROS dependency"
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "libusb-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/libphidget21/0.7.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1a22abc0ac28d5c9c8ee3b17df8d05be"
SRC_URI[sha256sum] = "5c5acae522f6e58661d819125794697d8de28be1409b98304ee8752ff724faa7"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-libphidget21-0.7.9-1"

inherit catkin
