DESCRIPTION = "A metapackage which extends ros_base and includes ROS libaries for any robot hardware. It may not contain any GUI dependencies."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "ros-base control-msgs diagnostics executive-smach filters geometry joint-state-publisher kdl-parser kdl-parser-py robot-state-publisher urdf urdf-parser-plugin xacro"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/robot/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "46b6e8445615d7d093552c7fac57c9e9"
SRC_URI[sha256sum] = "4f0efd47cf90e8a1f56602612d73ba032fbb231dec3091f53b795a7d67cbe02b"

ROS_SPN = "metapackages"
S = "${WORKDIR}/metapackages-release-release-melodic-robot-1.4.1-0"

inherit catkin
