DESCRIPTION = "The neonavigation meta-package including 3-dof configuration space planner"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "costmap-cspace joystick-interrupt map-organizer neonavigation-common neonavigation-launch obj-to-pointcloud planner-cspace safety-limiter track-odometry trajectory-tracker"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3f31398f0cab6a3fb5e075f322d7bd9a"
SRC_URI[sha256sum] = "9727d6cebeaf29da5f5b07df89ecafff51a21d33badcb38bd480e0adfd8af9b7"

S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation-0.4.3-1"

inherit catkin
