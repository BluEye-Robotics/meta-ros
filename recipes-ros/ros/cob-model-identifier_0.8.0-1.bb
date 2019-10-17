DESCRIPTION = "The cob_model_identifier package"
AUTHOR = "Christoph Mark"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost cmake-modules geometry-msgs kdl-parser orocos-kdl roscpp roslint sensor-msgs std-srvs tf"

RDEPENDS_${PN} = "rospy"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_model_identifier/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "afb699f1338687924dc46b81d00577d3"
SRC_URI[sha256sum] = "1064b368f90bb9cbc6e5d28d45d1ee8de8ba25bd810c770114e2403c87e5998a"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_model_identifier-0.8.0-1"

inherit catkin
