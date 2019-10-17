DESCRIPTION = "Message definitions for neonavigation package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "planner-cspace-msgs costmap-cspace-msgs map-organizer-msgs safety-limiter-msgs trajectory-tracker-msgs"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/neonavigation_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0a41c30c7c56bf8de839f8bfa9c09489"
SRC_URI[sha256sum] = "72cf1e5ef7e9b0431705b47be4bfd14dfd9775b208ff62f1e98ba75c86b7551c"

S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-neonavigation_msgs-0.5.0-1"

inherit catkin
