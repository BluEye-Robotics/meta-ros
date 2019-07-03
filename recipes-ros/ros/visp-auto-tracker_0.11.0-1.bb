DESCRIPTION = "Online automated pattern-based object tracker relying on visual servoing. visp_auto_tracker wraps model-based trackers provided by ViSP visual servoing library into a ROS package. The tracked object should have a QRcode of Flash code pattern. Based on the pattern, the object is automaticaly detected. The detection allows then to initialise the model-based trackers. When lost of tracking achieves a new detection is performed that will be used to re-initialize the tracker. This computer vision algorithm computes the pose (i. e. position and orientation) of an object in an image. It is fast enough to allow object online tracking using a camera."
AUTHOR = "Filip Novotny"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "geometry-msgs libdmtx-dev message-filters resource-retriever roscpp sensor-msgs std-msgs visp visp-bridge visp-tracker zbar geometry-msgs libdmtx-dev message-filters resource-retriever roscpp sensor-msgs std-msgs visp visp-bridge visp-tracker zbar"

RDEPENDS_${PN} = "geometry-msgs libdmtx-dev message-filters resource-retriever roscpp sensor-msgs std-msgs visp visp-bridge visp-tracker zbar"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_auto_tracker/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ac01950adf2a150dc3d865cd28c7b5c3"
SRC_URI[sha256sum] = "248e0d90da7bc9700cc38b4c9966c1381f25de6ec125eec39a1ac5fad7d95bf2"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_auto_tracker-0.11.0-1"

inherit catkin
