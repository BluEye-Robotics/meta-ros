DESCRIPTION = "This package wraps the libphidget21 to use it as a ROS dependency"
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "libusb-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/libphidget21/0.7.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5b9088fdc2eef2ba4007e55c673d9530"
SRC_URI[sha256sum] = "69660b7d771da1f35e899d0a658ba8d32e940015d336c37a176d7a21dc715aed"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-libphidget21-0.7.7-0"

inherit catkin
