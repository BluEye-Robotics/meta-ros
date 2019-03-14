DESCRIPTION = "ArbotiX Drivers"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "arbotix-msgs arbotix-python arbotix-sensors arbotix-controllers arbotix-firmware"

RDEPENDS_${PN} = "arbotix-msgs arbotix-python arbotix-sensors arbotix-controllers arbotix-firmware"

SRC_URI = "https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix/0.10.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9daecf2ad28f9ba2693fb3242fef175e"
SRC_URI[sha256sum] = "3e72d718f9b9129b8537614cc5ae68e696b97def92315b859a5d2f00219f09e1"

S = "${WORKDIR}/arbotix_ros-release-release-melodic-arbotix-0.10.0-0"

inherit catkin
