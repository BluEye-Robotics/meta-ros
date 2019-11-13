DESCRIPTION = "Online automated pattern-based object tracker relying on visual servoing. visp_auto_tracker wraps model-based trackers provided by ViSP visual servoing library into a ROS package. The tracked object should have a QRcode of Flash code pattern. Based on the pattern, the object is automaticaly detected. The detection allows then to initialise the model-based trackers. When lost of tracking achieves a new detection is performed that will be used to re-initialize the tracker. This computer vision algorithm computes the pose (i. e. position and orientation) of an object in an image. It is fast enough to allow object online tracking using a camera."
AUTHOR = "Filip Novotny"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "geometry-msgs libdmtx-dev message-filters resource-retriever roscpp sensor-msgs std-msgs visp visp-bridge visp-tracker zbar geometry-msgs libdmtx-dev message-filters resource-retriever roscpp sensor-msgs std-msgs visp visp-bridge visp-tracker zbar"

RDEPENDS_${PN} = "geometry-msgs libdmtx-dev message-filters resource-retriever roscpp sensor-msgs std-msgs visp visp-bridge visp-tracker zbar"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_auto_tracker/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dcb2001be9f185d0f076c10d5672134e"
SRC_URI[sha256sum] = "5104d94e90ea8520a8556fe6293a20f31f824c7a178d2a332f95b69c4c05ee48"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_auto_tracker-0.11.1-1"

inherit catkin
