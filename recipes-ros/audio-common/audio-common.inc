SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "212448b8a63107aac9274f2e9dad262e"
SRC_URI[sha256sum] = "9121ce7ea80945a9efb46d89bd33a454877344aa1b4f405f944943a62e1e4bab"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "audio_common"
