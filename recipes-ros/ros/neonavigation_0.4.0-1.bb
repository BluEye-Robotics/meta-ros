DESCRIPTION = "The neonavigation meta-package including 3-dof configuration space planner"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "costmap-cspace joystick-interrupt map-organizer neonavigation-common neonavigation-launch obj-to-pointcloud planner-cspace safety-limiter track-odometry trajectory-tracker"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3e98bb521a2dae350ea785d00f1d4e18"
SRC_URI[sha256sum] = "7c1272e2747a1a8ad0b6824d007f96a07927a192106a0f145853ddf5efeb7fd1"

S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation-0.4.0-1"

inherit catkin
