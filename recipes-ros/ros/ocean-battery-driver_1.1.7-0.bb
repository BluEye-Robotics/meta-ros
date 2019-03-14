DESCRIPTION = "This is an interface to the Ocean Server Technology Intelligent Battery and Power System."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp pr2-msgs diagnostic-updater diagnostic-msgs log4cxx roscpp pr2-msgs diagnostic-updater diagnostic-msgs log4cxx"

RDEPENDS_${PN} = "roscpp pr2-msgs diagnostic-updater diagnostic-msgs log4cxx"

SRC_URI = "https://github.com/pr2-gbp/pr2_power_drivers-release/archive/release/melodic/ocean_battery_driver/1.1.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "de55532c0e6cfd409b81e759291c2188"
SRC_URI[sha256sum] = "4a494470bf4da45f24517df66b0c0fea70f79e15c14e6935e00f990d4e23b084"

ROS_SPN = "pr2_power_drivers"
S = "${WORKDIR}/pr2_power_drivers-release-release-melodic-ocean_battery_driver-1.1.7-0"

inherit catkin
