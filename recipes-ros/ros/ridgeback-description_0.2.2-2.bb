DESCRIPTION = "URDF robot description for Ridgeback"
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch robot-state-publisher lms1xx urdf xacro"

RDEPENDS_${PN} = "robot-state-publisher lms1xx urdf xacro"

SRC_URI = "https://github.com/clearpath-gbp/ridgeback-release/archive/release/melodic/ridgeback_description/0.2.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9019931fd04180bc139dbcb621ee9058"
SRC_URI[sha256sum] = "c42a5de9d035df2856a1a1308d58ecd190ed087c9bb0ffc2ae7fd25385bf1c70"

ROS_SPN = "ridgeback"
S = "${WORKDIR}/ridgeback-release-release-melodic-ridgeback_description-0.2.2-2"

inherit catkin
