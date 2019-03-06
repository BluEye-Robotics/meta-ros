SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "136f5949bb5aaf99b9c99030827da8dd"
SRC_URI[sha256sum] = "9a1268621518fc22afd7b12ef1cf30e6901a57b054535924d1d74fd5d267773a"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "geometry2"
