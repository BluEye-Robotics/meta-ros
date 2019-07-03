DESCRIPTION = "Launch and configuration files for move_base, localization etc. on the MiR robot."
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "amcl base-local-planner dwb-critics dwb-local-planner dwb-plugins map-server mir-driver mir-dwb-critics move-base nav-core-adapter sbpl-lattice-planner"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_navigation/1.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e2d6fbe7b3ee8827e9cac16c075ab868"
SRC_URI[sha256sum] = "1ac9fd30f725c0b8fb509496fd475584d0cb21e6b526e19e4d41f6b853b4fec6"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_navigation-1.0.4-1"

inherit catkin
