DESCRIPTION = "A ROS driver for the SICK TiM and the SICK MRS 1000 laser scanners."
AUTHOR = "Jochen Sprickerhof"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libusb-1.0-dev roslaunch diagnostic-updater dynamic-reconfigure roscpp sensor-msgs libusb-1.0-dev"

RDEPENDS_${PN} = "libusb-1.0 robot-state-publisher xacro"

SRC_URI = "https://github.com/uos-gbp/sick_tim-release/archive/release/melodic/sick_tim/0.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "31c5e53f66fdf83e504f663ec680e148"
SRC_URI[sha256sum] = "21cbe180b6016b00a94db9fdcaca49ef8d560608c041bb975b5babb0e8f9aaf3"

S = "${WORKDIR}/sick_tim-release-release-melodic-sick_tim-0.0.16-1"

inherit catkin
