DESCRIPTION = "URDF robot description for Warthog"
AUTHOR = "Ryan Gariepy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch robot-state-publisher urdf xacro"

RDEPENDS_${PN} = "robot-state-publisher urdf xacro"

SRC_URI = "https://github.com/clearpath-gbp/warthog-release/archive/release/melodic/warthog_description/0.1.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "954c0da6ff78e2ab2e1ec4450e3f8d6a"
SRC_URI[sha256sum] = "dd90723c17e49d8ee56e64008479d08bdbf4e3344ee37cca5612f54ec1ed2033"

ROS_SPN = "warthog"
S = "${WORKDIR}/warthog-release-release-melodic-warthog_description-0.1.1-2"

inherit catkin
