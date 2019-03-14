DESCRIPTION = "A simple viewer for ROS image topics with draw-on features"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge geometry-msgs image-geometry image-transport image-view message-filters message-generation pcl-ros roscpp rostest sensor-msgs std-msgs std-srvs tf cv-bridge geometry-msgs image-geometry image-transport image-view message-filters message-runtime pcl-ros roscpp sensor-msgs std-msgs std-srvs tf"

RDEPENDS_${PN} = "cv-bridge geometry-msgs image-geometry image-transport image-view message-filters message-runtime pcl-ros roscpp sensor-msgs std-msgs std-srvs tf"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/image_view2/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "91b58e0f82aed02890994eae41d8b7be"
SRC_URI[sha256sum] = "fc10ec510f70e52bb26455ddc62237f9b9c3dfa77819fa84c140d41617db004c"

ROS_SPN = "jsk_common"
S = "${WORKDIR}/jsk_common-release-release-melodic-image_view2-2.2.10-0"

inherit catkin
