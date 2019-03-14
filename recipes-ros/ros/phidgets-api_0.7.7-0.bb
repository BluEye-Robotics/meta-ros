DESCRIPTION = "A C++ Wrapper for the Phidgets C API"
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libusb-1.0-dev libphidget21 libusb-1.0 libphidget21"

RDEPENDS_${PN} = "libusb-1.0 libphidget21"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_api/0.7.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "46dfcd282815ecfba13bca0d0aeb9ae9"
SRC_URI[sha256sum] = "bfbd02aa5ca164b4ba558a53dd7ddeff44e81b7682c9ea21c08f4f3aa9333152"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_api-0.7.7-0"

inherit catkin
