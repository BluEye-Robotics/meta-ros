DESCRIPTION = "The jsk_rviz_plugins package"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge diagnostic-msgs dynamic-reconfigure geometry-msgs image-geometry jsk-footstep-msgs jsk-gui-msgs jsk-hark-msgs jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools message-generation mk people-msgs rosbuild  std-msgs urdfdom-py view-controller-msgs cv-bridge diagnostic-msgs dynamic-reconfigure geometry-msgs image-geometry image-publisher jsk-footstep-msgs jsk-gui-msgs jsk-hark-msgs jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools message-generation people-msgs posedetection-msgs  std-msgs urdfdom-py view-controller-msgs python-scipy"

RDEPENDS_${PN} = "cv-bridge diagnostic-msgs dynamic-reconfigure geometry-msgs image-geometry image-publisher jsk-footstep-msgs jsk-gui-msgs jsk-hark-msgs jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools message-generation people-msgs posedetection-msgs  std-msgs urdfdom-py view-controller-msgs python-scipy"

SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_rviz_plugins/2.1.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8b0279aaa6ebd58ead4b08d90e9baa60"
SRC_URI[sha256sum] = "c1c50044f24196bb50fc782cb407e7ed9c8540a7525c6f305b0ec44641d74f27"

ROS_SPN = "jsk_visualization"
S = "${WORKDIR}/jsk_visualization-release-release-melodic-jsk_rviz_plugins-2.1.5-0"

inherit catkin
