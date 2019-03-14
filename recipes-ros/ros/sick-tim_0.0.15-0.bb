DESCRIPTION = "A ROS driver for the SICK TiM and the SICK MRS 1000 laser scanners."
AUTHOR = "Jochen Sprickerhof"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libusb-1.0-dev roslaunch diagnostic-updater dynamic-reconfigure roscpp sensor-msgs libusb-1.0-dev"

RDEPENDS_${PN} = "libusb-1.0 robot-state-publisher xacro"

SRC_URI = "https://github.com/uos-gbp/sick_tim-release/archive/release/melodic/sick_tim/0.0.15-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2fe7a1334053c56d333b70c320f9b913"
SRC_URI[sha256sum] = "7e331af0eea21b51239fc2ed9b451fe43529d24569f208a3e71591e2f334c3e1"

S = "${WORKDIR}/sick_tim-release-release-melodic-sick_tim-0.0.15-0"

inherit catkin
