DESCRIPTION = "Launch and configuration files for move_base, localization etc. on the MiR robot."
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "amcl base-local-planner dwb-critics dwb-local-planner dwb-plugins map-server mir-driver mir-dwb-critics move-base nav-core-adapter sbpl-lattice-planner"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_navigation/1.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bca4873993f492f88fd18e5640e0f322"
SRC_URI[sha256sum] = "dac30d2af0f96d6e417f116fecd33236e34a4fe32fa13b26ae4910801d807fcb"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_navigation-1.0.3-0"

inherit catkin
