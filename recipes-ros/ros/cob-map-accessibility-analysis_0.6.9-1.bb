DESCRIPTION = "cob_map_accessibility_analysis receives the map from navigation as well as obstacles and inflates_obstacles topics to assemble a common obstacle map. Upon request, this node checks the accessibility of poses within thin map by (i) checking whether the pose itself is free and by (ii) checking whether there is a closed path from robot to the goal pose."
AUTHOR = "Richard Bormann"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation boost cob-3d-mapping-msgs cv-bridge geometry-msgs image-transport opencv pcl message-filters nav-msgs pcl-ros roscpp sensor-msgs tf"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_map_accessibility_analysis/0.6.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4e820c37c0fefb1d369ce9f2baace4bc"
SRC_URI[sha256sum] = "d9f16525dec9057d3ea009ae214fa5917bc5becc62a0a35e28a07e547d53b459"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_map_accessibility_analysis-0.6.9-1"

inherit catkin
