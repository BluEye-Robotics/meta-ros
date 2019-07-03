DESCRIPTION = "A C++ Wrapper for the Phidgets C API"
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libusb-1.0-dev libphidget21 libusb-1.0 libphidget21"

RDEPENDS_${PN} = "libusb-1.0 libphidget21"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_api/0.7.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8dbf01607e95938ec282b687dd57ce8f"
SRC_URI[sha256sum] = "c3f33f14fcfc032dddcb02b6a7938265972b7133804823a5cae8c9d51c30a46f"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_api-0.7.9-1"

inherit catkin
