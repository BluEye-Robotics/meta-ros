DESCRIPTION = "Message, service and action definitions for environment perception."
AUTHOR = "Georg Arbeiter"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib actionlib-msgs cob-object-detection-msgs geometry-msgs sensor-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/melodic/cob_3d_mapping_msgs/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2741dbf06fad16632019714d57f2f3fa"
SRC_URI[sha256sum] = "8efeb75129ad677ff76f1f42626d9fbc6cfa16b8854d349707765936e97e2d43"

ROS_SPN = "cob_perception_common"
S = "${WORKDIR}/cob_perception_common-release-release-melodic-cob_3d_mapping_msgs-0.6.14-1"

inherit catkin
