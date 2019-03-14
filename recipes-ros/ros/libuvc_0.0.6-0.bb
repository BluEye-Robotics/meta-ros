DESCRIPTION = "USB Video Class driver library"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pkgconfig libusb-1.0-dev libjpeg catkin libusb-1.0-dev libjpeg"

RDEPENDS_${PN} = "catkin libusb-1.0-dev libjpeg"

SRC_URI = "https://github.com/ros-drivers-gbp/libuvc-release/archive/release/melodic/libuvc/0.0.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "458ea77ae163a577b8bf3754ac70ab95"
SRC_URI[sha256sum] = "06a553e6d043735a10fff606d5f71a20661fc9b6be392b69a06c35b8aca8d3f6"

S = "${WORKDIR}/libuvc-release-release-melodic-libuvc-0.0.6-0"

inherit catkin
