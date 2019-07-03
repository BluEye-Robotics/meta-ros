DESCRIPTION = "Common Manipulation Messages and Services Used in RAIL Manipulation Packages"
AUTHOR = "David Kent"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs geometry-msgs message-generation sensor-msgs visualization-msgs actionlib-msgs geometry-msgs message-runtime sensor-msgs visualization-msgs"

RDEPENDS_${PN} = "actionlib-msgs geometry-msgs message-runtime sensor-msgs visualization-msgs"

SRC_URI = "https://github.com/gt-rail-release/rail_manipulation_msgs-release/archive/release/melodic/rail_manipulation_msgs/0.0.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "215bfc1a03d2821d9ec7f94edc234792"
SRC_URI[sha256sum] = "37dfdcee92e63c8bdb5f83315c2d96936813f40d158a3afbd68e35fceb6e2965"

S = "${WORKDIR}/rail_manipulation_msgs-release-release-melodic-rail_manipulation_msgs-0.0.14-1"

inherit catkin
