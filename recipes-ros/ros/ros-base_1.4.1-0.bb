DESCRIPTION = "A metapackage which extends ros_core and includes other basic non-robot tools like actionlib, dynamic reconfigure, nodelets, and pluginlib."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "ros-core actionlib bond-core dynamic-reconfigure nodelet-core"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/ros_base/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "75dd0c783c46b77f9302b86f728b1dfc"
SRC_URI[sha256sum] = "0b0cab7cb298a642bd33a0c4d7e17f10ac6533a1a59745a11e96c58d238f47eb"

ROS_SPN = "metapackages"
S = "${WORKDIR}/metapackages-release-release-melodic-ros_base-1.4.1-0"

inherit catkin
