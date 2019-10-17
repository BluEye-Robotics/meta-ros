DESCRIPTION = "Autonomous mapping and navigation demos for the Clearpath Husky"
AUTHOR = "Prasenjit Mukherjee"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch amcl gmapping map-server move-base navfn base-local-planner dwa-local-planner"

RDEPENDS_${PN} = "amcl gmapping map-server move-base navfn base-local-planner dwa-local-planner"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_navigation/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e48ab047dfe6a9efb2d395540556940d"
SRC_URI[sha256sum] = "91db7fc019d68d7575152dafb0ea8ac59f803cd6cdd727aece323d03f6e10c1f"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_navigation-0.4.1-1"

inherit catkin
