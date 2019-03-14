DESCRIPTION = "Common Manipulation Messages and Services Used in RAIL Manipulation Packages"
AUTHOR = "David Kent"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs geometry-msgs message-generation sensor-msgs visualization-msgs actionlib-msgs geometry-msgs message-runtime sensor-msgs visualization-msgs"

RDEPENDS_${PN} = "actionlib-msgs geometry-msgs message-runtime sensor-msgs visualization-msgs"

SRC_URI = "https://github.com/gt-rail-release/rail_manipulation_msgs-release/archive/release/melodic/rail_manipulation_msgs/0.0.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "264d28922dbb60de515cdb22e06e6b5c"
SRC_URI[sha256sum] = "2d8effa0a61ce81ef4a037ce360defc578616e2b6e5c1981144ba08e89dbd473"

S = "${WORKDIR}/rail_manipulation_msgs-release-release-melodic-rail_manipulation_msgs-0.0.12-0"

inherit catkin
