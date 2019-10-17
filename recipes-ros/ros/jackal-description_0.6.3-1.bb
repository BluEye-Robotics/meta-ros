DESCRIPTION = "URDF robot description for Jackal"
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch robot-state-publisher urdf xacro lms1xx"

RDEPENDS_${PN} = "robot-state-publisher urdf xacro lms1xx"

SRC_URI = "https://github.com/clearpath-gbp/jackal-release/archive/release/melodic/jackal_description/0.6.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1c348f69fb45ea27c9c6af588dfe8bf7"
SRC_URI[sha256sum] = "12dae750592cd3ae4ca0ddff02f0c1556c7cd7174be6955555ebc34e5162b9fc"

ROS_SPN = "jackal"
S = "${WORKDIR}/jackal-release-release-melodic-jackal_description-0.6.3-1"

inherit catkin
