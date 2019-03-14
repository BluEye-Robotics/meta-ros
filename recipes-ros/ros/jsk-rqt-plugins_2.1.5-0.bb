DESCRIPTION = "The jsk_rqt_plugins package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mk rosbuild image-view2 message-generation rqt-gui rqt-gui-py rqt-plot rqt-gui rqt-gui-py rqt-plot rqt-image-view qt-gui-py-common resource-retriever image-pipeline image-view2 jsk-gui-msgs cv-bridge python-urlgrabber python-sklearn message-runtime"

RDEPENDS_${PN} = "rqt-gui rqt-gui-py rqt-plot rqt-gui rqt-gui-py rqt-plot rqt-image-view qt-gui-py-common resource-retriever image-pipeline image-view2 jsk-gui-msgs cv-bridge python-urlgrabber python-sklearn message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_rqt_plugins/2.1.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "29cc660a354750a08c92e05219244f22"
SRC_URI[sha256sum] = "c2205a66a68f133e6e9f7fb7dbbb8448c5291b3b077c542ea1bca58a08942527"

ROS_SPN = "jsk_visualization"
S = "${WORKDIR}/jsk_visualization-release-release-melodic-jsk_rqt_plugins-2.1.5-0"

inherit catkin
