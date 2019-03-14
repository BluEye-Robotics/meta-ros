DESCRIPTION = "ROS nodes and nodelets for 2-D image perception."
AUTHOR = "Manabu Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles cmake-modules cv-bridge dynamic-reconfigure libeigen geometry-msgs git image-geometry image-transport image-view2 jsk-data jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools libcmt message-generation mk nodelet opencv-apps pcl-ros posedetection-msgs roscpp roseus rospack sensor-msgs std-msgs tf robot-self-filter yaml-cpp angles cv-bridge dynamic-reconfigure libeigen geometry-msgs image-geometry image-transport image-view image-view2 imagesift jsk-data jsk-gui-msgs jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools libcmt message-runtime mk nodelet opencv-apps openni2-launch pcl-ros posedetection-msgs python-h5py python-chainer-pip python-chainercv-pip python-dlib leveldb python-fcn-pip python-sklearn python-pyyaml rosbag roscpp roseus rospack rospy rostopic rqt-gui  sensor-msgs sound-play std-msgs tf robot-self-filter yaml-cpp"

RDEPENDS_${PN} = "angles cv-bridge dynamic-reconfigure libeigen geometry-msgs image-geometry image-transport image-view image-view2 imagesift jsk-data jsk-gui-msgs jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools libcmt message-runtime mk nodelet opencv-apps openni2-launch pcl-ros posedetection-msgs python-h5py python-chainer-pip python-chainercv-pip python-dlib leveldb python-fcn-pip python-sklearn python-pyyaml rosbag roscpp roseus rospack rospy rostopic rqt-gui  sensor-msgs sound-play std-msgs tf robot-self-filter yaml-cpp"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_perception/1.2.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3c9540d484bb747eacb94f796b560bee"
SRC_URI[sha256sum] = "879ecf4adac145cc7eba67203dddd888998ffb2fff2cd77156c4122312611c2e"

ROS_SPN = "jsk_recognition"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_perception-1.2.9-0"

inherit catkin
