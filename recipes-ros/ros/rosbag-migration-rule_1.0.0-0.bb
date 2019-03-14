DESCRIPTION = "This empty package allows to export rosbag migration rule files without depending on rosbag."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/rosbag_migration_rule-release/archive/release/melodic/rosbag_migration_rule/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "202d1867e3c6ab313ebbe1cdcb2a5f2e"
SRC_URI[sha256sum] = "985744e58043e42585c195d72c7f8c0a265b646ca9dbfdf7d67d4488ed2a2a11"

S = "${WORKDIR}/rosbag_migration_rule-release-release-melodic-rosbag_migration_rule-1.0.0-0"

inherit catkin
